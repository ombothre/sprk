const checkboxes = document.querySelectorAll('.cbox');
const change = document.getElementById('qselect');
const bstatus = document.getElementById('generate');

// Function to update count when any checkbox is changed
function updateCount() {
    const checkedCheckboxes = document.querySelectorAll('.cbox:checked');
    const count = checkedCheckboxes.length;

    change.innerHTML = count;

    if (count > 4) {
        bstatus.disabled = false;
    }
    else {
        bstatus.disabled = true;
    }
}

// Add event listener to each checkbox
checkboxes.forEach(checkbox => {
    checkbox.addEventListener('change', updateCount);
});

const gotoo = () => {
    window.location.href = "index.html"
}

// Get the button and the popup container
const popup = document.getElementById('popupContainer');

function pop() {
    popup.style.display = 'flex';
}

function closePopup() {
    popup.style.display = 'none';
}

const elementp = document.getElementById('bpython');
const elements = document.getElementById('bsql');
const elementj = document.getElementById('bjava');
const elementc = document.getElementById('bc');

function bpython() {
    elementp.style.backgroundColor = "#00b451";
    elements.style.backgroundColor = "#00E167";
    elementj.style.backgroundColor = "#00E167";
    elementc.style.backgroundColor = "#00E167";
}

function bsql() {
    elementp.style.backgroundColor = "#00E167";
    elements.style.backgroundColor = "#00b451";
    elementj.style.backgroundColor = "#00E167";
    elementc.style.backgroundColor = "#00E167";
}

function bjava() {
    elementp.style.backgroundColor = "#00E167";
    elements.style.backgroundColor = "#00E167";
    elementj.style.backgroundColor = "#00b451";
    elementc.style.backgroundColor = "#00E167";
}

function bc() {
    elementp.style.backgroundColor = "#00E167";
    elements.style.backgroundColor = "#00E167";
    elementj.style.backgroundColor = "#00E167";
    elementc.style.backgroundColor = "#00b451";
}

//Mail

const emailid = document.getElementById('s-email').value;

function handleMail() {
    function sendEmail(emailid) {
        fetch('/send-email', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json', // Adjust the content type if needed
            },
            body: JSON.stringify({ email: emailid }), // Replace with the actual email
        })
        .then(response => {
            if (response.ok) {
                console.log('Email sent successfully!');
            } else {
                console.error('Failed to send email');
            }
        })
        .catch(error => {
            console.error('Error:', error);
        });
    }
    
    // Call sendEmail() when you want to trigger the email sending
}

//Question Viewer

const buttons = document.querySelectorAll('.q.open');
const popWindow = document.getElementById('popupContainer2');

function handleOpen() {
    popWindow.style.display = 'flex';
}
function closeePopup() {
    popWindow.style.display = 'none';
}

buttons.forEach(button => {
    button.addEventListener('click', handleOpen);
})

//Question delete

const sections = document.querySelectorAll('.question-box-info');

function handleDel(args) {
    const areaDel = document.getElementById(args);
    areaDel.style.display = 'none';
}

