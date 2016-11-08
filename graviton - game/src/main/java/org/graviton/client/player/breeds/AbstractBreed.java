package org.graviton.client.player.breeds;

import lombok.extern.slf4j.Slf4j;
import org.graviton.client.player.breeds.models.*;

/**
 * Created by Botan on 05/11/2016 : 22:59
 */
@Slf4j
public abstract class AbstractBreed {


    public static AbstractBreed get(byte breed) {
        try {
            return (AbstractBreed) BreedEnum.values()[breed - 1].breedClass.newInstance();
        } catch (Exception e) {
            log.error("exception -> {}", e);
        }
        return null;
    }

    public short getDefaultSkin(byte sex) {
        return (short) ((id() * 10) + sex);
    }

    public abstract byte id();

    public enum BreedEnum {
        FECA(Feca.class),
        OSAMODAS(Osamodas.class),
        ENUTROF(Enutrof.class),
        SRAM(Sram.class),
        XELOR(Xelor.class),
        ECAFLIP(Ecaflip.class),
        ENIRIPSA(Eniripsa.class),
        IOP(Iop.class),
        CRA(Cra.class),
        SADIDA(Sadida.class),
        SACRIEUR(Sacrieur.class),
        PANDAWA(Pandawa.class);

        private final Class breedClass;

        BreedEnum(Class breedClass) {
            this.breedClass = breedClass;
        }
    }

}
