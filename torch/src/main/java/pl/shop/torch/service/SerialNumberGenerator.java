package pl.shop.torch.service;

public class SerialNumberGenerator {
    public static int generate(Object o) {
        return o.hashCode();
    }
}
