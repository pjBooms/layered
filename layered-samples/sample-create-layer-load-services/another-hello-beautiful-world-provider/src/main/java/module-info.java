import ru.excelsior.layered.samples.helloworldprovider.HelloWorldProviderImpl;
import ru.excelsior.layered.samples.spi.helloworldprovider.HelloWorldProvider;

module another.hello.beautiful.world.provider {

    requires another.hello.world;

    provides HelloWorldProvider with HelloWorldProviderImpl;
}