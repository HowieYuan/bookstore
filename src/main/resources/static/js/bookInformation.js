const bookId = GetQueryString();

/**
 * @return {string} id
 */
function GetQueryString() {
    const reg = new RegExp("(^|&)" + "id" + "=([^&]*)(&|$)");
    const r = window.location.search.substr(1).match(reg);
    if (r !== null) {
        s = unescape(decodeURI(decodeURI(r[2])));
        return s.substring(4, s.length);
    }
    return null;
}


$(function () {
    $.ajax({
        url: "http://localhost:8080/bookInformation/" + bookId,
        type: "GET",
        dataType: "json",
        data: {},
        traditional: true,
        success: function (e) {
            s = ["<div class=\"indent\">",
                "    <div id=\"mainpic\">",
                "        <img src='" + e.message.imageURL + "'",
                "             style=\"width: 135px;max-height: 183px;\"/>",
                "    </div>",
                "    <div id=\"info\">",
                "        <span class=\"pl\">书名：</span>" + e.message.name + "<br>",
                "        <span class=\"pl\">作者：</span>" + e.message.author + "<br>",
                "        <span class=\"pl\">类别：</span>" + e.message.category + "<br>",
                "        <span class=\"pl\">价格：</span>" + e.message.price + "<br>",
                "        <span class=\"pl\">库存：</span>" + e.message.quantity + "<br>",
                "        <span class=\"pl\">页数：</span>" + e.message.pageNum + "<br>",
                "        <span class=\"pl\">出版社：</span>" + e.message.press + "<br>",
                "        <span class=\"pl\">ISBN：</span>" + e.message.isbn + "<br>",
                "    </div>",
                "</div>",
                "<div class=\"related_info\">",
                "    <h2>",
                "        <span class=\"\">内容简介</span>",
                "        &nbsp;·&nbsp;·&nbsp;·&nbsp;·&nbsp;·&nbsp;·",
                "    </h2>",
                "    <div>本书深入浅出地介绍了Java线程和并发，是一本完美的Java并发参考手册。书中从并发性和线程安全性的基本概念出发，",
                "        介绍了如何使用类库提供的基本并发构建块，用于避免并发危险、构造线程安全的类及验证线程安全的规则，",
                "        如何将小的线程安全类组合成更大的线程安全类，如何利用线程来提高并发应用程序的吞吐量，如何识别可并行执行的任务，",
                "        如何提高单线程子系统的响应性，如何确保并发程序执行预期任务，如何提高并发代码的性能和可伸缩性等内容，",
                "        最后介绍了一些高级主题，如显式锁、原子变量、非阻塞算法以及如何开发自定义的同步工具类。",
                "        本书适合Java程序开发人员阅读。",
                "    </div>",
                "    <h2>",
                "        <span class=\"\">作者简介</span>",
                "        &nbsp;·&nbsp;·&nbsp;·&nbsp;·&nbsp;·&nbsp;·",
                "    </h2>",
                "    <div>本书作者都是Java Community Process JSR 166专家组（并发工具）的主要成员，并在其他很多JCP专家组里任职。",
                "        Brian Goetz有20多年的软件咨询行业经验，并著有至少75篇关于Java开发的文章。Tim Peierls是“现代多处理器”的典范，",
                "        他在BoxPop.biz、唱片艺术和戏剧表演方面也颇有研究。Joseph Bowbeer是一个Java ME专家，",
                "        他对并发编程的兴趣始于Apollo计算机时代。David Holmes是《The Java Programming Language》一书的合著者，",
                "        任职于Sun公司。Joshua Bloch是Google公司的首席Java架构师，《Effective Java》一书的作者，",
                "        并参与著作了《Java Puzzlers》。Doug Lea是《Concurrent Programming》一书的作者，",
                "        纽约州立大学 Oswego分校的计算机科学教授。",
                "    </div>",
                "</div>"].join("");
            $("#content").html(s);
        },
        error: function (e) {
            alert("error");
            console.log(e);
        }
    })
});