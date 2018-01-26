jQuery.fn.extend ({
	serializableJson : function (){
		var o = {};
		$.each($(this).serializeArray(),function(i,v){
			if(o[v[name]]){
				o[v.name] = o[v[name]] + "," + v.value;
			}else{
				o[v.name] = v.value;
			}
		})
		return o;
	}
});

$.formJsonAjax = function(options){
	var opts = {
		url : 'N/A',
		data : {},
		success : $.noop,
		error : $.noop
	};
	$.extend(opts, options);
	$.ajax({
		url : opts.url,
		data : opts.data,
		type : "POST",
		dataType : "json",
		cache: false,
		success : function(result) {
			if (opts.success) {
				opts.success(result);
			}
		},
		error : opts.error
	});
}