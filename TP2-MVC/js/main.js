let modeleInteger = new(ModeleInteger);
let printObserver = new(PrintObserver);

modeleInteger.addObserver(printObserver);

let controler = new Controler(modeleInteger)

modeleInteger.addObserver(printObserver);
