<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<jsp:include page="/WEB-INF/template/cabecalho.jsp"/>

<p>Sobre: <span class="assunto">${assunto}</span> - <a href="<c:url value="/"/>">novo</a></p>

<table bordercolor="black" width="100%">
	<c:forEach items="${comentarios}" var="comentario">
		<tr>
			<td align="right">Data:</td>
			<td class="comentario">
				<fmt:formatDate value="${comentario.data.time}" pattern="dd/MM/yyyy HH:mm:ss" />
			</td>
		</tr>
		<tr>	
			<td align="right">Autor:</td>
			<td class="comentario">${comentario.email}</td>
		</tr>
		<tr>
			<td align="right">Assunto:</td>	
			<td class="comentario">${comentario.assunto}</td>
		</tr>
		<tr>
			<td align="right" style="vertical-align: top;">Coment&aacute;rio:</td>	
			<td class="comentario">${comentario.comentario}</td>
		</tr>
		<tr>
			<td colspan="2">
				<hr />
			</td>
		</tr>	
	</c:forEach>
</table>

<jsp:include page="/WEB-INF/template/rodape.jsp"/>