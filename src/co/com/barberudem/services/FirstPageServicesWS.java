package co.com.barberudem.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import co.com.barberudem.model.FirstPageDTO;


@Path("/json/firstpage")
public class FirstPageServicesWS {
  
  @GET
  @Path("/servicio1")
  @Produces(MediaType.APPLICATION_JSON)
  public FirstPageDTO getFirstPageDTO() {
    
    FirstPageServices firstPageServices = new FirstPageServicesImpl();
    return firstPageServices.getFirstPageDTO();
        
//    BarberFacade barberFacade = BarberFacade.getInstance();
//    return barberFacade.getFirstPageDTO();
  }

}
