class View {
    constructor() {
		this.min = 0;
		this.max = 10;
		/*ajout des button*/
        this.textArea = document.createElement("input");
        this.textArea.type = "number";
        this.textArea.min = "0";
        this.textArea.max = "10";
        this.buttonPlus = document.createElement("button");
        this.buttonPlus.className = "buttonPlus";
        this.buttonPlus.textContent = "Plus";
        this.buttonMoins = document.createElement("button");
        this.buttonMoins.className = "buttonMoins";
        this.buttonMoins.textContent = "Moins";
		this.sliderBar = document.createElement("input");
        this.sliderBar.className = "slider";
		this.sliderBar.type = "range";
		this.sliderBar.name = "sliderValue";
		this.sliderBar.min = "0";
		this.sliderBar.max = "10";
		this.sliderBar.value = "0";
		this.sliderBar.step = "1";
		this.checkBox = document.createElement("input");
        this.checkBox.className = "mycheckbox";
		this.checkBox.type = "checkbox";
		this.checkBox.checked = false;

        this.div = document.querySelector('#div1');
        this.div.appendChild(this.textArea);
        this.div.appendChild(this.buttonPlus);
        this.div.appendChild(this.buttonMoins);
		this.div.appendChild(this.sliderBar);
		this.div.appendChild(this.checkBox);
		this.div.appendChild(document.createElement("br"));
		
		/*ajout du menu*/
		this.menuPlus = document.createElement("div");
		this.menuPlus.className = "subMenu";
		this.menuPlus_a = document.createElement("a");
		this.menuPlus_a.href = "#";
		this.menuPlus_a.className = "buttonPlus";
		this.menuPlus_a.textContent = "menu";
		this.menuPlus.appendChild(this.menuPlus_a);
		
		this.menuMoins = document.createElement("div");
		this.menuMoins.className = "subMenu";
		this.menuMoins_a = document.createElement("a");
		this.menuMoins_a.href = "#";
		this.menuMoins_a.className = "buttonMoins";
		this.menuMoins_a.textContent = "menu";
		this.menuMoins.appendChild(this.menuMoins_a);
		
		this.menu = document.querySelector('#menu');
		this.menu.appendChild(this.menuPlus);
		this.menu.appendChild(this.menuMoins);
    }
	
	disabled(element="all",bool=false){
		console.log(this.textArea.disabled);
		if(element==="all"){
			this.buttonPlus.disabled = bool;
			this.buttonMoins.disabled = bool;
			this.sliderBar.disabled = bool;
			this.menuPlus.disabled = bool;
			this.menuMoins.disabled = bool;
			this.textArea.disabled = bool;
		} else if(element==="plus"){
			if(this.textArea.disabled !== true){
				this.buttonPlus.disabled = bool;
				this.menuPlus.disabled = bool;	
			}
		} else if(element==="moins"){
			if(this.textArea.disabled !== true){
				this.buttonMoins.disabled = bool;
				this.menuMoins.disabled = bool;	
			}
		} else{
			element.disabled = bool;
		}
	}
}