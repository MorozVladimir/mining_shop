$(document).ready(function(){
		$('#login').blur(function(event){
			event.preventDefault();
			let login = $('#login').val();
	//		alert(login);
		$.ajax({ url: 'iscontain', data: ({login : login}), success: function(result){alert(result);} });
		});
	});