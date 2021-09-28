<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
  
   <c:url value = "/alterarParque" var="linkSvltAlterarParque" />
   
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU" crossorigin="anonymous">
<link href="https://drive.google.com/uc?export=view&id=1PcK8oJVtAN2tjfLM93Q-dxPuuoxAbkuv" type="text/css" rel="stylesheet" />
<meta charset="ISO-8859-1">
<title>Alteração - Parque</title>
</head>
<body>


	<div class="container">
		<div class="row">
			<div class="col">
			
			<form action="${linkSvltAlterarParque}" method="post" >
				
				<label for="basic-url" class="form-label">Alteração em ${parque.nome}</label>
				
				<div class="input-group mb-3">
				  	<span class="input-group-text">Nome do Parque</span>
				  	<input type="text" class="form-control" name="nome" value="${parque.nome}">
				</div>
				
				<div class="input-group mb-3">
					<span class="input-group-text">Descrição</span>
				  	<input type="text" class="form-control" name="desc" value="${parque.desc}">
				</div>	
			
				<div class="input-group mb-3">
					<span class="input-group-text">Horário de Funcionamento</span>
				  	<input type="text" class="form-control" name="horarioFunc" value="${parque.horarioFunc}">
				  	<span class="input-group-text">Avaliação Geral (1 à 5)</span>
				  	<input type="number" class="form-control" name="avaliacao" min="0" max="5" value=${parque.avaliacao}>
				</div>	
				
				<div class="input-group mb-3">
					<span class="input-group-text">Site Oficial</span>
					<span class="input-group-text">https://exemplo.com.br</span>
				  	<input type="text" class="form-control" name="urlOfc" value="${parque.urlOfc}">
				</div>	
			
				<input type="hidden" name="id" value="${parque.id}" />
				<input type="submit" />
			</form>
	
			
			
			
			</div>
		</div>
	</div>

</body>
</html>