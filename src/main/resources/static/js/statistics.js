$(function () {
    $.ajax({
        url: url + "/statistics",
        type: "GET",
        dataType: "json",
        data: {},
        traditional: true,
        beforeSend: function (e) {
            e.setRequestHeader("Token", localStorage.mytoken)
        },
        success: function (e) {
            if (e.result === "success") {
                for (i = 0; i < e.message.length; i++) {
                    t = "<tr>" +
                        "<td>" + e.message[i].category + "</td>" +
                        "<td>" + e.message[i].sales + "</td>" +
                        "<td>" + e.message[i].amount + "</td>" +
                        "</tr>";
                    table = $("#table");
                    table.html(table.html() + t);
                }
            } else {
                alert(e.message);
                window.location.href = 'index.html';
            }
        },
        error: function (e) {
            alert("error");
            console.log(e);
        }
    })
});

$("#submit").click(function () {
    let url = "http://localhost:8080/statistics/export";
    let xhr = new XMLHttpRequest();
    xhr.open('get', url, true);
    xhr.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded');
    xhr.setRequestHeader('Token', localStorage.mytoken);
    xhr.responseType = 'blob';
    xhr.onload = function () {
        if (this.status === 200) {
            let blob = this.response;
            let reader = new FileReader();
            reader.readAsDataURL(blob);
            reader.onload = function (e) {
                let a = document.createElement('a');
                a.download = '图书销售统计报表.xlsx';
                console.log(e);
                a.href = window.URL.createObjectURL(blob);
                a.click();
            };
        }
    };
    xhr.send();
});