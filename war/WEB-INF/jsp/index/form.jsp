<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include page="/WEB-INF/template/cabecalho.jsp"/>

<form id="formComentario" action="<c:url value="/index/salva"/>" method="post">
	<table bordercolor="black">
		<tr>
			<td>
				Assunto: 
			</td>
			<td>	
				<input type="text" name="comentario.assunto" size="80" value="${comentario.assunto}"/>			
			</td>
		</tr>
		<tr>	
			<td>
				E-mail:  
			</td>
			<td>
				<input type="text" name="comentario.email" size="40" value="${comentario.email}"/>			
			</td>
		</tr>
		<tr>			
			<td>
				Comentário: 
			</td>
			<td>
				<textarea name="comentario.comentario" rows="20" cols="80">${comentario.comentario}</textarea>			
			</td>
		</tr>
		<tr>				
			<td colspan="2" align="center">
				<input type="submit" value="Enviar"/>			
			</td>	
		</tr>
	</table>
</form>

<jsp:include page="/WEB-INF/template/rodape.jsp"/>