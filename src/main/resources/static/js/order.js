$(function () {
    $.ajax({
        url: url + "/order",
        type: "GET",
        dataType: "json",
        data: {},
        traditional: true,
        success: function (e) {
            for (i = 0; i < e.message.length; i++) {
                t = "<tr id='order" + e.message[i].id + "' onclick='toOrderInformation(" + e.message[i].id + ")'>"+
                    "<td id='orderId" + e.message[i].id + "'>" + e.message[i].orderId + "</td>" +
                    "<td id='name" + e.message[i].id + "'>" + e.message[i].reader.name + "</td>" +
                    "<td id='bookName" + e.message[i].id + "'>" + e.message[i].bookName + "</td>" +
                    "<td id='status" + e.message[i].id + "'>" + e.message[i].status + "</td>" +
                    "<td id='date" + e.message[i].id + "'>" + e.message[i].date + "</td>" +
                    "</tr>";
                table = $("#table");
                table.html(table.html() + t);
            }
        },
        error: function (e) {
            alert("error");
            console.log(e);
        }
    })
});

function toOrderInformation(id) {
    window.location.href='orderInformation.html?id=' + id;
}