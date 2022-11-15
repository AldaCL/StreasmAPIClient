package rickandmortyapp.cli;

import com.beust.jcommander.Parameter;

public class CLIArguments {

    CLIArguments(){

    }

    @Parameter(
            required = true,
            descriptionKey = "ID del personaje",
            description = "ID del personaje"
    )
    private String id;


    @Parameter(
            names = {"--name", "-n"},
            description = "Nombre del personaje a buscar"
    )
    private String name;

    @Parameter(
            names = {"--page", "-p"},
            description = "PAGINACION"
    )
    private int page = 0;

    @Parameter(
            names = {"--alive", "-a"},
            description = "Estado del personaje"
    )
    private String status;

    @Parameter(
            names = "--help",
            help = true,
            description = "Mostrar ayura"
                )
    private boolean isHelp;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPage() {
        return page;
    }

    public String getStatus() {
        return status;
    }

    public boolean isHelp() {
        return isHelp;
    }

    @Override
    public String toString() {
        return "CLIArguments{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", page=" + page +
                ", status='" + status + '\'' +
                ", isHelp=" + isHelp +
                '}';
    }

    public static CLIArguments newInstance(){
        return new CLIArguments();
    }
}
