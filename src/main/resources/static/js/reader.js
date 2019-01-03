$(function () {
    $.ajax({
        url: url + "/reader",
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
                    t = "<tr id='reader" + e.message[i].id + "' onclick='bookInformatio(id)'>" +
                        "<td id='id" + e.message[i].id + "'>" + e.message[i].id + "</td>" +
                        "<td id='name" + e.message[i].id + "'>" + e.message[i].name + "</td>" +
                        "<td id='gender" + e.message[i].id + "'>" + e.message[i].gender + "</td>" +
                        "<td id='age" + e.message[i].id + "'>" + e.message[i].age + "</td>" +
                        "<td id='tel" + e.message[i].id + "'>" + e.message[i].tel + "</td>" +
                        "<td id='purchaseSum" + e.message[i].id + "'>" + e.message[i].purchaseSum + "</td>" +
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

// function bookInformation(id) {
//     window.location.href='bookInformation.html?id=' + id;
// }