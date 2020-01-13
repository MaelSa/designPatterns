package tp1;

public class Stats extends Visitor {
    private int nbAssig = 0;
    private int nbBlock = 0;
    private int nbBinExpr = 0;
    private int nbInteger = 0;
    private int nbVarRef = 0;
    private int nbWhile = 0;
    private int nbPrint = 0;
    private int nbRead = 0;
    private int nbCond = 0;


    @Override
    public void visit(Assignment node) {
        nbAssig++;
    }

    @Override
    public void visit(Conditional node) {
        nbCond++;
    }

    @Override
    public void visit(Read node) {
        nbRead++;
    }

    @Override
    public void visit(Print node) {
        nbPrint++;
    }

    @Override
    public void visit(While node) {
        nbWhile++;
    }

    @Override
    public void visit(Block node) {
        nbBlock++;
    }

    @Override
    public void visit(BinExpression node) {
        nbBinExpr++;
    }

    @Override
    public void visit(VariableRef node) {
        nbVarRef++;
    }

    @Override
    public void visit(Integer node) {
        nbInteger++;
    }

    public int getNbBinExpr() {
        return nbBinExpr;
    }

    public int getNbBlock() {
        return nbBlock;
    }

    public int getNbAssig() {
        return nbAssig;
    }

    public int getNbInteger() {
        return nbInteger;
    }

    public int getNbVarRef() {
        return nbVarRef;
    }

    public int getNbWhile() {
        return nbWhile;
    }

    public int getNbPrint() {
        return nbPrint;
    }

    public int getNbRead() {
        return nbRead;
    }

    public int getNbCond() {
        return nbCond;
    }
}