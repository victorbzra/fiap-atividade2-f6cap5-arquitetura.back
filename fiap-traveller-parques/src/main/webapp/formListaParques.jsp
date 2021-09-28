<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List, br.com.fiap.traveller.parque.servlet.Parques"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

    
<!DOCTYPE html>
<html lang="pr-br">
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU" crossorigin="anonymous">
<link href="https://drive.google.com/uc?export=view&id=1PcK8oJVtAN2tjfLM93Q-dxPuuoxAbkuv" type="text/css" rel="stylesheet" />
<title>Lista de Parques - Traveller</title>
</head>
<body>

	<div class="container">
		<div class="row">
			<div class="col">
				<table class="table table-striped tabela" >
					<thead>
	 				<tr>
        				<th scope="col">Nome do Parque</th>
        				<th scope="col">Funcionamento</th>
        				<th scope="col">Avaliação</th>
        				<th scope="col">Ações</th>
    				</tr>
     				</thead> 
       
    				<tbody>   
				  	<c:forEach items="${listaparques}" var="listaparques">
				  		<tr>
					  		<td><a href="${listaparques.urlOfc}" target="_blank" title="${listaparques.desc}">${listaparques.nome}</a></td>
					  		<td>${listaparques.horarioFunc}</td>
					  		<td>${listaparques.avaliacao}</td>
					  		<td>
							   	<a href="/fiap-traveller-parques/removerParque?id=${listaparques.id}">Excluir</a>
							   	<a href="/fiap-traveller-parques/showPq?id=${listaparques.id}">Alterar</a>
							</td>
				  		</tr>
					</c:forEach>
					
						<td scope="col"><a href="./novoParqueCriado.jsp">CADASTRAR NOVO PARQUE</a></td>
						<td></td>
						<td></td>
						<td></td>
					
					</tbody> 
	
				</table>
	
		
	
	</div>
	</div>
	</div>
	
	
 
 
 	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-/bQdsTh/da6pkI1MST/rWKFNjaCP5gBSY4sEBT38Q/9RBh9AH40zEOg7Hlq2THRZ" crossorigin="anonymous"></script>
 	
</body>
</html>