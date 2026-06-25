package barker.justin.trglass;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.resource.v1.ResourceLoader;
import net.fabricmc.fabric.api.resource.v1.pack.PackActivationType;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.resources.Identifier;

public class Main implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        FabricLoader.getInstance().getModContainer("translucent-glass").ifPresent(container -> {
            ResourceLoader.registerBuiltinPack(Identifier.fromNamespaceAndPath("translucent-glass", "translucent-glass"),
                    container, PackActivationType.DEFAULT_ENABLED);
        });
    }
}
