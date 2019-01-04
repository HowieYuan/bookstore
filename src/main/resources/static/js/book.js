$(function () {
    $.ajax({
        url: url + "/book",
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
                    t = "<tr id='book" + e.message[i].id + "' onclick='bookInformation(id)'>" +
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

function bookInformation(id) {
    window.location.href = 'bookInformation.html?id=' + id;
}

function bookAdd() {
    window.location.href = "bookAdd.html";
}

function search() {
    searchContent = $("#searchContent").val();
    if (searchContent == null || searchContent.length <= 0) {
        alert("搜索内容为空！")
    } else {
        $.ajax({
            url: url + "/book/" + searchContent,
            type: "GET",
            dataType: "json",
            data: {},
            traditional: true,
            beforeSend: function (e) {
                e.setRequestHeader("Token", localStorage.mytoken)
            },
            success: function (e) {
                if (e.result === "success") {
                    table = $("#table");
                    table.html("");
                    for (i = 0; i < e.message.length; i++) {
                        t = "<tr id='book" + e.message[i].id + "' onclick='bookInformation(id)'>" +
                            "<td id='name" + e.message[i].id + "'>" + e.message[i].name + "</td>" +
                            "<td id='category" + e.message[i].id + "'>" + e.message[i].category + "</td>" +
                            "<td id='price" + e.message[i].id + "'>" + e.message[i].price + "</td>" +
                            "<td id='quantity" + e.message[i].id + "'>" + e.message[i].author + "</td>" +
                            "<td id='quantity" + e.message[i].id + "'>" + e.message[i].press + "</td>" +
                            "<td id='quantity" + e.message[i].id + "'>" + e.message[i].quantity + "</td>" +
                            "</tr>";
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
    }
}