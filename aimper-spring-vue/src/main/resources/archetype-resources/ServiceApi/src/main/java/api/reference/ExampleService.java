package ${package}.api.reference;

public interface ExampleService {
    /**
     * Loads example short info
     * @param id example id
     * @return
     */
    ExampleShortDto loadExample(Long id);

    /**
     * Creates (or updates) example. Returns id of saved or created example.
     * @param example info to save
     * @return id of saved example.
     */
    long saveExample(ExampleShortDto example);
}