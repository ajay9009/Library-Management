$('document').ready(function(){
	$.getJSON('StJSON',{ajax:true},function(data){
		$('#estate').append($('<option>').text('-Select-'));	
	$.each(data,function(i,item){
		$('#estate').append($('<option>').text(item.STATENAME).val(item.STATEID));
 	});	
 	});
	
	$('#estate').change(function(){
		$('#ecity').empty();
		$.getJSON('CtJSON',{ajax:true, stateid:$('#estate').val()},function(data){
			$('#ecity').append($('<option>').text('-Select-'));	
		$.each(data,function(i,item){
			$('#ecity').append($('<option>').text(item.CITYNAME).val(item.CITYID));
	 	});
		
	});
	
	
});
});
