$("span").click(function() {
	alert(12323)
	$.ajax({
		url: "/login",
		type: "POST",
		dataType : "json",
		success: function (res) {
			console.log(res);
		}
	})
})
