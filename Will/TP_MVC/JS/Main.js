$.i18n().load({
	'fr' : {
		'app_name':'TP MVC FR',
		'buttonPlus':'Plus',
		'buttonMoins':'Moins'
	},
	'en' : {
		'app_name':'TP MVC EN',
		'buttonPlus':'Plus',
		'buttonMoins':'Minus'
	},
	'ru' : {
		'app_name':'TP MVC ¯\\_(ツ)_/¯',
		'buttonPlus':'+',
		'buttonMoins':'-'
	}
}).done(updateTxt());

function updateTxt(){
	$.i18n().locale=document.getElementsByTagName('html')[0].getAttribute('lang');
	
	console.log(document.getElementsByTagName('html')[0].getAttribute('lang'));
	// Modification du titre de la page en récupérant
	document.title = $.i18n('app_name');

	$('.buttonPlus').text($.i18n('buttonPlus'));
	$('.buttonMoins').text($.i18n('buttonMoins'));
	
	const dateFormat = new Intl.DateTimeFormat(document.getElementsByTagName('html')[0].getAttribute('lang'));
	const formatedDate = dateFormat.format(new Date());
	$('#date').text(formatedDate);
}

function main() {
    let modelInteger1 = new ModelInteger();
	let modelInteger2 = new ModelInteger();
    let controler = new SuperControler(modelInteger1,modelInteger2); 
	//let controler = new Controler(modelInteger1); 	
	updateTxt();
}

main();