<%@ page language="java" contentType="ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="ISO-8859-1">
<title>Cadastro Novo Parque</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU" crossorigin="anonymous">
<link href="https://drive.google.com/uc?export=view&id=1PcK8oJVtAN2tjfLM93Q-dxPuuoxAbkuv" type="text/css" rel="stylesheet" />
</head>
<body>

	<div class="container">
		<div class="row">
			<div class="col">
					<form action="/fiap-traveller-parques/novoParque" method="post">
					
						<label for="basic-url" class="form-label">Cadastro de Novo Parque</label>
						
						<div class="input-group mb-3">
				  			<span class="input-group-text">Nome do Parque</span>
				  			<input type="text" class="form-control" aria-describedby="basic-addon3" name="nome">
						</div>
					
						<div class="input-group mb-3">
							<span class="input-group-text">Descrição</span>
				  			<input type="text" class="form-control" name="desc">
						</div>	
				
						<div class="input-group mb-3">
							<span class="input-group-text">Horário de Funcionamento</span>
				  			<input type="text" class="form-control" name="horarioFunc">
				  			<span class="input-group-text">Avaliação Geral (1 à 5)</span>
				  			<input type="number" class="form-control" name="avaliacao" min="0" max="5">
						</div>	
						
						<div class="input-group mb-3">
							<span class="input-group-text">Site Oficial</span>
							<span class="input-group-text">https://exemplo.com.br</span>
				  			<input type="text" class="form-control" name="urlOfc">
						</div>	
						
						<input type="submit" />
						
					</form>
	
			<a href="./listaParques">Voltar à lista</a>
		
	
	</div>
	</div>
	</div>

	
	
	


</body>
</html>