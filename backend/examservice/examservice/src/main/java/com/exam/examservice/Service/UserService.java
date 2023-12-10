package com.exam.examservice.Service;


import com.exam.examservice.entity.*;
import com.exam.examservice.enums.Roles;
import com.exam.examservice.exception.DataAlreadyExistException;
import com.exam.examservice.repository.*;
import com.exam.examservice.response.ApiResponse;
import jakarta.servlet.http.HttpSession;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.HashSet;
import java.util.Set;

@Service
public class UserService {
    


    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ExamInfoRepository examInfoRepository;

    @Autowired
    private PythonRepository pythonRepository;

    @Autowired
    private JavaRepository javaRepository;

    @Autowired
    private CRepository cRepository;
    @Autowired
    private SqlRepository sqlRepository;



    public ApiResponse<UserModel> login(String username, String password) {
        UserModel user = userRepository.findByUserName(username);

        if (user != null && user.getPassword().equals(password)) {
            // Passwords match, return the user
            return new ApiResponse<>("Login successful", user);
        } else {
            // Invalid login credentials
            return new ApiResponse<>("Invalid username or password", null);
        }
    }

    public UserModel createUser(String userName, String email, String password){
        UserModel userModel = userRepository.findByUserName(userName);

        if(userModel != null){
            throw new DataAlreadyExistException("This user already exist");
        }


        UserModel user = UserModel.builder()
                .userName(userName)
                .email(email)
                .password(password)
                .enabled(true)
                .roles(new HashSet<>(Roles.ROLE_ADMIN.ordinal()))
                .build();

        userRepository.save(user);

        return userModel;

    }

    public ApiResponse<String> logout(HttpSession session) {
        // Retrieve the logged-in user from the session
        UserModel loggedInUser = (UserModel) session.getAttribute("user");

        if (loggedInUser != null) {

            session.invalidate();
            return new ApiResponse<>("Logout successful", null);
        } else {
            return new ApiResponse<>("No user logged in", null);
        }
    }

    @Transactional
    public PythonModel createExam(String questions, String optionOne, String optionTwo,
                                  String optionThree, String optionFour, String correctAnswer,
                                  String marks) {


/*
        // Create a new PythonModel instance
        PythonModel pythonModel = new PythonModel();

        // Set question set
        Set<String> questionSet = new HashSet<>();
        for (String question : questions) {
            questionSet.add(question);
        }

        pythonModel.setPyQuestions(questionSet);
        pythonModel.setOptionOne(optionOne);
        pythonModel.setOptionTwo(optionTwo);
        pythonModel.setOptionThree(optionThree);
        pythonModel.setOptionFour(optionFour);
        pythonModel.setPyAns(correctAnswer);
        pythonModel.setPymarks(marks);

        // Save the PythonModel to the database
        return pythonRepository.save(pythonModel);

        */

        return null;
    }

}
