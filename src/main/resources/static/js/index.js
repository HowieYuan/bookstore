$("#submit").click(function () {
    $.ajax({
        url: "http://localhost:8080/login",
        type: "POST",
        dataType: "json",
        data: {
            username: $("#userId").val(),
            password: $("#password").val()
        },
        traditional: true,
        success: function (e) {
            if ("success" === e.result) {
                localStorage.mytoken = e.message;
                localStorage.myUserName = $("#userId").val();
                window.location.href = "book.html";
            } else {
                alert(e.message);
            }
        },
        error: function (e) {
            alert("error");
        }
    })
});