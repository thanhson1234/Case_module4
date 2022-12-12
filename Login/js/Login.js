function login() {
    let email = document.getElementById("email").value;
    let password = document.getElementById("password").value;

    let Account = {
        email: email,
        passWord: password,
    }
    $.ajax({
        type: "POST",
        headers: {
            //kiểu dữ liệu nhận về
            'Accept': 'application/json',
            // kiểu truyền đi
            'Content-Type': 'application/json',
        },
        url: "http://localhost:8080/login",
        data: JSON.stringify(Account),
        //xử lý khi thành công
        success: function (data) {
            console.log(data)
            localStorage.setItem("token", data.token);
            localStorage.setItem("roles", data.roles.name);
            let roles = localStorage.getItem("roles");
            if (roles==("Admin")){
                location.href = "Admin.html"
            }else if (roles=="Giao_Vien") {

                location.href="Giao_Vien.html"

            }else if (roles== "gia0_vu"){

                location.href="Giao_Vu.html"

            }else if (roles=="Hoc_Vien"){
                location.href="Hoc_Vien.html"
            }else {
                alert("không có quyền truy cập")
            }
        },
        error: function (err) {
           alert("Login fail ! Try again please !");
        }
    })
    event.preventDefault();

}