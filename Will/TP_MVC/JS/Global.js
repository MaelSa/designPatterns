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
	}
}).done( function() {
	$.i18n().locale=document.getElementsByTagName('html')[0].getAttribute('lang');//'fr';

	// Modification du titre de la page en récupérant
	document.title = $.i18n('app_name');

	$('.buttonPlus').text($.i18n('buttonPlus'));
	$('.buttonMoins').text($.i18n('buttonMoins'));
});