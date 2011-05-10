$(document).ready(function() {
	
	$('#submitAssunto').click(function() {
	  var assunto = $("#assunto").val();
//	  $("#formAssunto").attr("action","/comente-sobre-gae/"+assunto);
	  $("#formAssunto").attr("action","/"+assunto);
	  $("#formAssunto").serialize();
	  $("#formAssunto").submit();
	});
	
	$("#formAssunto").validate({
		rules: {
			"comentario.assunto": "required"
		},
		messages: {
			"comentario.assunto": "Preencha o assunto"
		}
	});
	
	$("#formComentario").validate({
		rules: {
			"comentario.assunto": "required",
			"comentario.email": {
				required : true,
				email : true
			},
			"comentario.comentario" : "required"
		},
		messages: {
			"comentario.assunto": "Preencha o assunto",
			"comentario.email" : {
				required : "Preencha o email",
				email : "Preencha um email v&aacute;lido"
			},
			"comentario.comentario": "Preencha o coment&aacute;rio"
		}
	});
	
});