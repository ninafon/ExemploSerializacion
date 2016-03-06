
package exemploserializacionficheiros;

import java.io.*;

public class MeuObjectOutputStream extends ObjectOutputStream {
    // constructores :
    public MeuObjectOutputStream()throws IOException{
        
    }
    public MeuObjectOutputStream(OutputStream ou)throws IOException{
        super(ou);
    }
    /* redefinición do método que escribe a cabeceira para que non faga nada */
    
    @Override
    protected void writeStreamHeader() throws IOException
    {
    }

    
}
