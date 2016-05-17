package co.com.barberudem.services;

import co.com.barberudem.model.FirstPageDTO;
import co.com.barberudem.model.LugarDTO;

public class BarberFacade {
  
  /** Instancia de si mismo. */
  private static BarberFacade barberFacade;
  
  /**
   * Constructor privado
   */
  private BarberFacade() {
    super();
  }
  
  /**
   * Obtiene una instancia de la facade
   * @return
   */
  public static BarberFacade getInstance() {
    if (barberFacade == null) {
      barberFacade = new BarberFacade();
    } 
    return barberFacade;
  }

	public FirstPageDTO getFirstPageDTO() {
		FirstPageServices firstPageServices = new FirstPageServicesImpl();
		return firstPageServices.getFirstPageDTO();
	}
	
  /**
   * Obtiene un lugar dado el id
   * @param lugarId
   * @return Lugar {@link Lugar}
   */
  public LugarDTO findLugarByID(int lugarId) {
    LugarServices lugarServices = new LugarServicesImpl();
    return lugarServices.findLugarByID(lugarId);
  }
}
