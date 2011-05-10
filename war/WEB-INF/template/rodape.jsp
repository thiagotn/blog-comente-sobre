<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	  </div>
	  <div class="grid_2"> 
	    <p> 
	
	    </p> 
	  </div>
      <div class="clear"></div>	  
	  <div class="grid_12"> 
	  	<hr />

	  </div> 
	  <!-- end .grid_12 --> 
	  	  
	  <!-- end .grid_6.pull_6 --> 
	  <div class="clear"></div>
	  <div class="grid_2"> 
	    <p> 

	    </p> 
	  </div> 
	  <!-- end .grid_2 --> 
	  <div class="grid_8">
	  	<p>
	  		<span class="topAssuntos">Top Assuntos:</span><br />
	  		<c:forEach items="${assuntos}" var="assunto" varStatus="i">
				<span class="assunto">
					<a href="<c:url value="/comentarios/sobre/${assunto[0]}"/>">
						${assunto[0]}
					</a>
				</span><span class="assuntoCount">(${assunto[1]})</span><br />
			</c:forEach>
	  	</p>
	  </div>
	  <div class="grid_2"> 
	    <p> 
	
	    </p> 
	  </div>
	  <div class="clear"></div>	  
	  <div class="grid_12"> 
	  	<hr />
		<p class="creditos">
			Desenvolvido por <a href="<c:url value="http://thiago.cc"/>" target="_blank">Thiago Nogueira</a><br />
			Código-fonte: <a href="<c:url value="http://github.com/thiagotn/comente-sobre-gae"/>" target="_blank">http://github.com/thiagotn/comente-sobre-gae</a>
		</p>	
	  </div> 
	  <!-- end .grid_12 --> 
	  <div class="clear"></div>
	</div> 
	<!-- end .container_12 -->
</body>
</html>