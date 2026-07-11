package net.dragonblockinfinity;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Mod(DragonBlockInfinity.MOD_ID)
public class DragonBlockInfinity {

    public static final String MOD_ID = "dragonblockinfinity";
    private static final Logger LOGGER = LoggerFactory.getLogger(DragonBlockInfinity.class);

    public DragonBlockInfinity(IEventBus modEventBus) {
        modEventBus.addListener(this::commonSetup);
        NeoForge.EVENT_BUS.register(this);

        LOGGER.info("DragonBlockInfinity mod inicializado!");
    }

    private void commonSetup(FMLCommonSetupEvent event) {
        LOGGER.info("Configuração comum do DragonBlockInfinity concluída.");
    }
}
