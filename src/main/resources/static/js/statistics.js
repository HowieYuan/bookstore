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
                window.location.href='index.html';
            }
        },
        error: function (e) {
            alert("error");
            console.log(e);
        }
    })
});