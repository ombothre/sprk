const url = 'http://localhost:9090/auth/api/login';

// Fetch with custom headers
fetch(url, {
  method: 'GET', 
  headers: {
    'ngrok-skip-browser-warning' : 'true'
  }
})
  .then((response) => {
    return response.json();
  })
  .then((data) => {
    console.log(data);
  })
