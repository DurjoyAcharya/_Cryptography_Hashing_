package javasecurity;

import java.security.Provider;
import java.security.Security;
import java.util.Set;
import java.util.TreeSet;
//Name  of algorithms uses in java by build in
public class Review {
    public static void SecurityProviders()
    {
        Set<String> algos=new TreeSet<>();
        for (Provider provider: Security.getProviders())
        {
            Set<Provider.Service> services=provider.getServices();
            services.stream()
                    .map(Provider.Service::getAlgorithm)
                    .forEach(algos::add);
        }
        algos.forEach(System.out::println);
    }
    public static void main(String[] args) {
        SecurityProviders();
    }
}
