package it.devlec.log;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class EsempioLog
{
    private static final Logger logger =  LogManager.getLogger(EsempioLog.class);

    public EsempioLog()
    {}
    public void stampaAltriLog()
    {
        int a = 5;
        int b = a * 10;

        // CASTIING ESPLICITO
        double c = (double) 4;
        double d = 5.5;

        String saluto = "Hello";
        String saluto2 = "World";

        //SOMMA CON CONTROLLO DI SELEZIONE
        if(b != a)
        {
            int somma = a + b;
            logger.fatal("Somma tra " + a + " e " + b + " è " + somma);
        }
        else
        {
            logger.error("Impossibile eseguire la somma!");
        }

        //DIVISIONE CON CONTROLLO DI ITERAZIONE
        for(int i = 0 ; i < 1 ; i++)
        {
            double div = c/d;
            logger.fatal("Divisione tra " + c + " e " + d + " è " + div);
        }

        //CONCATENAMENTO CON STRINGHE
        logger.debug(saluto + " " + saluto2);
    }
}
