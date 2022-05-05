package ObjetosTeoria;

import ObjetosTeoria.Modelos.Persona;

public class HelloWorld {

    public static void main(String[] args) {
        // TipoObjeto nombreVariable = new TipoObjeto(Parametros definidos en los constructores);
        Persona lucas = new Persona();
        lucas.setDni(4458);
        lucas.setApellido("Galetti");
        lucas.setNombre("Lucas");
        System.out.println("Mi nombre es: " + lucas.getNombre() + " mi apellido es: " + lucas.getApellido() + " mi dni es : " + lucas.getDni());

        Persona lucas2 = new Persona();
        System.out.println("Mi nombre es: " + lucas2.getNombre() + " mi apellido es: " + lucas2.getApellido() + " mi dni es : " + lucas2.getDni());
        lucas.addEdadIfDniExists(421,4211);

                        // TipoObjeto.NombreMetodo(Parametros);
        System.out.println(Persona.holaSoyLucas());

    }
}
