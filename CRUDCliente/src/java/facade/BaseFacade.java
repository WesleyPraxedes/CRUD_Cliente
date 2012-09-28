package facade;

import html.GeraHTML;

/**
 *
 * @author Wesley
 */
public class BaseFacade {
    protected GeraHTML html;
    
    public BaseFacade(){
        html = new GeraHTML();
    }
}
