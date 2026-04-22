//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //Se crea un presidente
    System.out.println("Se crea un presidente:");
    Presidente presi1 = new Presidente("Juan Lagos",30);
    presi1.setNombre("Juan");
    System.out.println("El presidente "+presi1.nombre+" tiene código" + presi1.codigo);
    System.out.println("Se crea un club");

    Club club1 = new Club("Los futboleros",15,"Deportivo");
    System.out.println("El club " + club1.nombre+" tiene " + club1.cantDeMiembros +", es de tipo" + club1.tipo + "y tiene un presidente ");
}
