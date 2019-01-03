$(function () {
    $.ajax({
        url: url + "/book",
        type: "GET",
        dataType: "json",
        data: {},
        traditional: true,
        success: function (e) {
            for (i = 0; i < e.message.length; i++) {
                t = "<tr id='book" + e.message[i].id + "' onclick='bookInformation(id)'>"+
                    "<td id='name" + e.message[i].id + "'>" + e.message[i].name + "</td>" +
                    "<td id='category" + e.message[i].id + "'>" + e.message[i].category + "</td>" +
                    "<td id='price" + e.message[i].id + "'>" + e.message[i].price + "</td>" +
                    "<td id='quantity" + e.message[i].id + "'>" + e.message[i].author + "</td>" +
                    "<td id='quantity" + e.message[i].id + "'>" + e.message[i].press + "</td>" +
                    "<td id='quantity" + e.message[i].id + "'>" + e.message[i].quantity + "</td>" +
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

function bookInformation(id) {
    window.location.href='bookInformation.html?id=' + id;
}