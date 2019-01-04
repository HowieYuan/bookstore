
$("#submit").click(function () {
    $.ajax({
        url: url + "/bookInformation/add",
        type: "POST",
        dataType: "json",
        data: {
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
                window.location.href = 'book.html';
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