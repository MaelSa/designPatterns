class UpdateActivation extends Observer{
   constructor(view, mediator){
       super();
       this.view = view;
       this.mediator = mediator;
   }

   action(model){
     this.mediator.mediate();
   }
}
