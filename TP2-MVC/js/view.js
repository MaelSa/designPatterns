class View {
    constructor() {
        this.buttonPlus = document.getElementById("button+")
        this.buttonMoins = document.getElementById("button-")
        this.text = document.getElementById("number")

        this.buttonMoins.innerText = '-'
        this.buttonPlus.innerText = '+'
    }

    setText(int) {

        this.text.value = '' + int;
        if (int === 0) {
          this.buttonMoins.disabled = true;
        } else {
          this.buttonMoins.disabled = false;
        }
    }
}
