function register() {
    let fullname = document.getElementById("fullname").value;
    let email = document.getElementById("email").value;
    let password = document.getElementById("password").value;
    let password1 = document.getElementById("password").value;

    if (password == password1){

        let Account = {
            fullname: fullname,
            email: email,
            passWord: password
        }
        $.ajax({
            type: "POST",
            url: "http://localhost:8080/students",
            headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json'
            },
            data: JSON.stringify(Account ),
            success: function (data) {
                location.href = "Login.html"
            }
        });


    }else {
        console.log("nhap lai mk ")
    }




}
