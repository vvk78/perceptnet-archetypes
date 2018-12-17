package ${package}.api.reference;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ${package}.api.reference.ExampleService;
import ${package}.api.reference.ExampleShortDto;

@Service
@Transactional
public class ExampleServiceImpl extends $.BaseServiceImpl{
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