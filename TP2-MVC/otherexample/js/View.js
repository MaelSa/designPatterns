class View{
    constructor(){
        $.i18n().load({
         'fr' : {
           'plus' : '+',
           'moins' : '-'
         },
         'en' : {
           'plus' : 'plus',
           'moins' : 'minus'
         }
     }).done( function() {
      $.i18n().locale='en';
      } );

        this.menu =  document.getElementById("myDropdown");
        this.buttonMenu = document.getElementById("ButtonMenu");
        this.checkbox = document.createElement('input');
        this.checkbox.type = "checkbox";
        this.checkbox.id = "check";
        this.checkbox.value = true;

        this.label = document.createElement('label')
        this.label.appendChild(document.createTextNode('Activé'));

        this.plus = document.createElement('button');
        this.plus.id = 'plus';
        this.plus.textContent = $.i18n('plus');

        this.moins = document.createElement('button');
        this.moins.id = 'moins';
        this.moins.textContent = $.i18n('moins');

        this.txt = document.createElement('input');
        this.txt.setAttribute("type", "text");
        this.txt.id = 'txt';

        this.slider = document.createElement('input');
        this.slider.type = 'range';
        this.slider.min = Model.MINVALUE;
        this.slider.max = Model.MAXVALUE;

        this.date = document.createElement('p');
        this.date.innerHTML = (new Intl.DateTimeFormat($.i18n().locale)).format(new Date());

        let div = document.createElement('div');
        div.appendChild(this.txt);
        div.appendChild(this.plus);
        div.appendChild(this.moins);
        div.appendChild(this.checkbox);
        div.appendChild(this.slider);
        div.appendChild(this.date);

        let nodeParent = document.querySelector('#outer');

        nodeParent.appendChild(div);
    }
}
