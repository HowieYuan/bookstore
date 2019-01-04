const bookId = GetQueryString();

$(function () {
    $.ajax({
        url: url + "/bookInformation/" + bookId,
        type: "GET",
        dataType: "json",
        data: {},
        traditional: true,
        beforeSend: function (e) {
            e.setRequestHeader("Token", localStorage.mytoken)
        },
        success: function (e) {
            if (e.result === "success") {
                $("#name").attr('value', e.message.name);
                $("#author").attr('value', e.message.author);
                $("#category").attr('value', e.message.category);
                $("#price").attr('value', e.message.price);
                $("#quantity").attr('value', e.message.quantity);
                $("#pageNum").attr('value', e.message.pageNum);
                $("#press").attr('value', e.message.press);
                $("#isbn").attr('value', e.message.isbn);
                $("#authorIntroduction").val(e.message.authorIntroduction);
                $("#introduction").val(e.message.introduction);
                $("#imageURL").attr('value', e.message.imageURL);
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
    $.ajax({
        url: url + "/bookInformation",
        type: "POST",
        dataType: "json",
        data: {
            id: bookId,
            name: $("#name").val(),
            author: $("#author").val(),
            price: $("#price").val(),
            category: $("#category").val(),
            press: $("#press").val(),
            imageURL: $("#imageURL").val(),
            pageNum: $("#pageNum").val(),
            isbn: $("#isbn").val(),
            introduction: $("#introduction").val(),
            authorIntroduction: $("#authorIntroduction").val(),
            quantity: $("#quantity").val()
        },
        traditional: true,
        beforeSend: function (e) {
            e.setRequestHeader("Token", localStorage.mytoken)
        },
        success: function (e) {
            alert(e.message);
            if (e.result === "success") {
                window.location.href = 'bookInformation.html?id=book' + bookId;
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


/**
 * @return {string} id
 */
function GetQueryString() {
    const reg = new RegExp("(^|&)" + "id" + "=([^&]*)(&|$)");
    const r = window.location.search.substr(1).match(reg);
    if (r !== null) {
        return unescape(decodeURI(decodeURI(r[2])));
    }
    return null;
}
