package co.com.barberudem.services;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import co.com.barberudem.model.FirstPageDTO;
import co.com.barberudem.model.LugarDTO;


@Path("/json/firstpage")
public class BarberFacadeWS {
  
  @GET
  @Path("/servicio1")
  @Produces(MediaType.APPLICATION_JSON)
  public FirstPageDTO getFirstPageDTO() {
    BarberFacade barberFacade = BarberFacade.getInstance();
    return barberFacade.getFirstPageDTO();
  }
  
  @GET
  @Path("/servicio2/{lugarId}")
  @Produces(MediaType.APPLICATION_JSON)
  public LugarDTO findLugarByID(@PathParam("lugarId") int lugarId) {
//    int lugarId = 1;
    BarberFacade barberFacade = BarberFacade.getInstance();
    return barberFacade.findLugarByID(lugarId);
  }

  
  /*
   * 
   * In JAX-RS The following annotations to extract the input values sent by the client.

@PathParam
@QueryParam
@MatrixParam
@FormParam
@PathParam URL Syntax

http://localhost:7001//rest/customers/100/Java4s

@QueryParam URL Syntax

http://localhost:7001/…/rest/customers?custNo=100&custName=Java4s

@MatrixParam URL Syntax

http://localhost:7001/…/rest/customers;custNo=100;custName=Java4s

@FormParam URL Syntax

If we have a HTML form having two input fields and submit button. Lets client enter those details and submit to the RESTful web service. Then the rest service will extract those details by using this @FormParam annotation.
   * 
   */
}
