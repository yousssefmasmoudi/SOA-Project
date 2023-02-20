<!DOCTYPE html>
<html>
<head>
	<style>
		body {
			font-family: Arial, sans-serif;
			background-color: #f2f2f2;
			margin: 0;
			padding: 0;
		}

		h2, h5 {
			text-align: center;
		}

		h2 {
			color: #333;
			font-size: 28px;
			margin-top: 30px;
			margin-bottom: 20px;
		}

		h5 {
			color: #666;
			font-size: 16px;
			margin-top: 0;
			margin-bottom: 20px;
		}

		form {
			display: flex;
			flex-wrap: wrap;
			justify-content: center;
			align-items: center;
			margin-bottom: 30px;
		}

		input[type=text], input[type=submit] {
			padding: 10px;
			margin: 10px;
			border-radius: 5px;
			border: 1px solid #ccc;
			font-size: 16px;
			color: #333;
			background-color: #fff;
			width: 300px;
			max-width: 100%;
			box-sizing: border-box;
		}

		input[type=submit] {
			background-color: #007bff;
			color: #fff;
			cursor: pointer;
		}

		input[type=submit]:hover {
			background-color: #0069d9;
		}

		a {
			display: block;
			text-align: center;
			font-size: 16px;
			margin-bottom: 20px;
			color: #007bff;
			text-decoration: none;
		}

		a:hover {
			text-decoration: underline;
		}
	</style>
</head>
<body>
	<h2>Gestionnaire des Etudiants</h2>
	<h5>Crée par Youssef Masmoudi</h5>
	<a href="webapi/myresource">Afficher la Liste des Etudiant</a>
	<form action="webapi/myresource/ajout?num=1000&nom=IHEBEDDIn&prenom=bbbb&heure=8522" method="POST">
		<input type="text" placeholder="Numero du Etudiant" id="numPat" name="numId">
		<input type="text" placeholder="Nom  du Etudiant"id="nomPat" name="nomId">
		<input type="text" placeholder="Prenom  du Etudiant"id="prenomPat" name="prenomId">
		<input type="text" placeholder="Heure rendezvous du Etudiant"id="heurePat" name="heureId">
		<input type="submit" value="Ajouter le Etudiant">
	</form>
	<script>
		//Ajout d'un Etudiant
		document.querySelector('form').onsubmit = function() {
			this.setAttribute('action', "webapi/myresource/ajout?num=" + document.querySelector('input[name=numId]').value + "&nom="+document.querySelector('input[name=nomId]').value +"&prenom="+ document.querySelector('input[name=prenomId]').value +"&heure="+document.querySelector('input[name=heureId]').value )
			alert("Etudiant Ajouté sans controle de saisie");
		}
	</script>
</body>
</html>
