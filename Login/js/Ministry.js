function show() {
    $.ajax({
        type: "GET", url: "http://localhost:8080/classall", //xử lý khi thành công
        headers: {"Authorization": "Bearer " + localStorage.getItem('token')},
        success: function (data) {
            let str = "";

            for (let i = 0; i < data.length; i++) {
                str += `<div class="item">
                             <div class="img">
                               <button type="button" onclick="nameClass(${data[i].id_Class})"  data-toggle="modal" data-target="#myModal"><img src="${data[i].img}"></button>
                             </div>
                                <div class="content">
                                    <div class="title">${data[i].id}</div>
                                   <div class="des">
                                        ${data[i].name}
                                    </div>
                                    <div class="price">${data[i].name_Class}</div>
                                  <td><button type="button" class="btn btn-primary" onclick="Edit_Demo(${data[i].id})">Edit</button></td>
                                   <td><button type="button" class="btn btn-danger" onclick="delete_Demo(${data[i].id})">Delete</button></td> 
                                </div>
                        </div>`
            }
            document.getElementById("list").innerHTML = str;
        }, error: function (err) {
            console.log(err)
        }
    })
}

show();

function nameClass(id) {
    $.ajax({
        type: "GET", url: "http://localhost:8080/student/" + id, //xử lý khi thành công
        headers: {"Authorization": "Bearer " + localStorage.getItem('token')},
        success: function (data) {
            let str = "";
            for (let i = 0; i < data.accounts.length; i++) {
                str += `
<tr>
<td>${data.accounts[i].id_Account}</td>
<td>${data.accounts[i].fullName}</td>
</tr>
                `
            }
            document.getElementById("nameClassRoom").innerHTML = data.nameClass;
            document.getElementById("studentClass").innerHTML = str;
        }, error: function (err) {
            console.log(err)
        }
    })
}
