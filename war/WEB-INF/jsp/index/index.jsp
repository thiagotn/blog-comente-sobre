<%@ page isELIgnored="false" %>
<%-- Remember: you SHOULD put the line above in all jsps if you want to use Expression Language
(${thisKindOfStuff}), web.xml configurations won't work on GAE --%>
<jsp:include page="/WEB-INF/template/cabecalho.jsp"/>

<form id="formAssunto" method="post">
<input type="hidden" name="actionFormAssunto" value="actionFormAssunto"/>
	<table align="center"  width="100%">
		<tr>
			<td align="center">
				Sobre o que você deseja comentar?
			</td>
		</tr>
		<tr>
			<td align="center">		
				<input type="text" id="assunto" size="60" name="comentario.assunto"/>			
			</td>
		</tr>	
		<tr>	
			<td align="center">
				<input type="submit" id="submitAssunto" value="Enviar"/>			
			</td>	
		</tr>
	</table>
</form>

<jsp:include page="/WEB-INF/template/rodape.jsp"/>