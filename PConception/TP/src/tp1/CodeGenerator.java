package tp1;

public class CodeGenerator extends Visitor {

    StringBuffer buffer;

    CodeGenerator(ProgramNode p) {
        buffer = new StringBuffer();
        p.accept(this);
    }

    @Override
    public void visit(Assignment node) {
        node.getVar().accept(this);
        buffer.append("=");
        node.getRhs().accept(this);
    }

    @Override
    public void visit(Conditional node) {
        buffer.append("if(");
        node.getCond().accept(this);
        buffer.append(") then {\n");
        node.getThen().accept(this);
        buffer.append("} else {\n");
        node.getElse().accept(this);
        buffer.append("\n}\n");
    }

    @Override
    public void visit(Read node) {
        buffer.append("read(");
        node.getVar().accept(this);
        buffer.append(")\n");
    }

    @Override
    public void visit(Print node) {
        buffer.append("print(");
        node.getPrint().accept(this);
        buffer.append(")\n");
    }

    @Override
    public void visit(While node) {
        buffer.append("while(");
        node.getCond().accept(this);
        buffer.append("){\n");
        node.getBody().accept(this);
        buffer.append("\n}\n");
    }

    @Override
    public void visit(Block node) {
        for(Statement tmp:node.getS()){
            tmp.accept(this);
        }
    }

    @Override
    public void visit(BinExpression node) {
        node.getLhs().accept(this);
        buffer.append(node.getOperator());
        node.getRhs().accept(this);
        buffer.append("\n");
    }

    @Override
    public void visit(VariableRef node) {
        buffer.append(node.getName());
    }

    @Override
    public void visit(Integer node) {
        buffer.append(node.getValue());

    }
}
