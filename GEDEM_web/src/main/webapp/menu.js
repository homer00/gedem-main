/**
 * 
 */
 /* Code Javascript externe pour générer le menu de l'application */
function addElements(){
		
	let mainStyle = document.createElement('style');
	//let mainStyle = document.getElementById('ladivmenu');
	let leStyle = `
	#nav-bar {
				display: flex;
				flex-direction: column;
				background-color: #ccc;
				width: 80%;
				margin: 0 auto;
				
			}
			#nav-bar a {
				padding: 10px;
				text-decoration: none;
				color: #000;
			}
			#nav-bar a:hover {
				background-color: #000;
				color: #FFF;
			}
			
			@media screen and (min-width: 350px) {
				#nav-bar {
					flex-flow: row wrap;
				}
				#nav-bar a {
					flex: 1 0 auto;
					text-align: center;
				}
			}`;
		mainStyle.innerText = leStyle;
		//on ajoute le contenu <style> dans le section <head>
		document.head.appendChild(mainStyle);
		let menuDiv = document.createElement('div');
		let newContent = document.createTextNode("Ceci est un texte");
		menuDiv.appendChild(newContent);
		let letrucavant = document.getElementById('table');
		document.body.insertBefore(menuDiv,letrucavant);
		menuDiv.innerHTML = `
		<nav id="nav-bar">
			<a href="#">GEDEM</a>
			<a href="#">PLANNING</a>
			<a href="#">EMARGEMENT</a>
			<a href="#">MON COMPTE</a>
			<a href="#">MA FORMATION</a>
		</nav>
		<br>
		<nav id="nav-bar">
			<a href="vue_12.html" target="page">Liste des formations</a>
			<a href="vue_10.html" target="page">Liste des formateurs</a>
			<a href="vue_11.html" target="page">Liste des stagiaires</a>
		</nav>
	`
}
addElements();